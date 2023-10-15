/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dino.ui;

import java.util.Date;
import mx.itson.dino.entities.Comment;
import mx.itson.dino.entities.Post;
import mx.itson.dino.entities.Topic;
import mx.itson.dino.entities.User;

/**
 * Representa un programa de simulación de un foro.
 * Permite crear usuarios, categorías, publicaciones y comentarios, así como
 * realizar operaciones como dar "like" y mostrar información relacionada.
 * @author arana
 */
public class Main {
     public static void main(String[] args) {
        // Crear usuarios
        User user1 = new User();
        user1.setUsername("Luis Miguel");
        user1.setEmail("luismiguel@gmail.com");
        user1.setPassword("Luismi5712");

        User user2 = new User();
        user2.setUsername("María Lopez");
        user2.setEmail("maria1234@gmail.com");
        user2.setPassword("Hola1234");

        // Crear una categoría
        Topic topic = new Topic();
        topic.setTopicName("Salud");

        // Crear una publicación
        Post post = new Post();
        post.setTitle("Dolor de cabeza");
        post.setContent("¡Hola!,  me ha estado doliendo mucho la cabeza, ¿Qué me recomiendan para que se me quite el dolor?");
        post.setTopic(topic);
        post.setLikesCount(0);
        post.setDate(new Date());
        post.setAuthor(user1);

        
        // Crear un comentario en la publicación
        Comment comment = new Comment();
        comment.setCommentContent("A mi siempre me funciona tomar paracetamol, ¡Espero que te mejores pronto!");
        comment.setLikes(0);
        comment.setDate(new Date());
        comment.setAuthor(user2);
        comment.setPost(post);
       
        
        
        // Añadir el comentario a la lista de comentarios de la publicación
        post.addComment(comment);
        
        // Dar "like" a la publicación y al comentario
        post.setLikesCount(post.getLikesCount() + 1);
        comment.setLikes(comment.getLikes() + 1);

        // Mostrar la información de la publicación y el comentario
        System.out.println("Publicación de " + post.getAuthor().getUsername() + ": " + post.getTitle());
        System.out.println("Categoría: " + post.getTopic().getTopicName());
        System.out.println("Contenido: " + post.getContent());
        System.out.println("Likes: " + post.getLikesCount());
         System.out.println("Fecha:"+ post.getDate());

        System.out.println("\nComentario de " + comment.getAuthor().getUsername() + ":");
        System.out.println(comment.getCommentContent());
        System.out.println("Likes: " + comment.getLikes());
         System.out.println("Fecha: "+ comment.getDate());
    }
}

