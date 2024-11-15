package com.openclassrooms.mddapi;

import com.openclassrooms.mddapi.dto.PostDto;
import com.openclassrooms.mddapi.models.Post;
import com.openclassrooms.mddapi.models.Topic;
import com.openclassrooms.mddapi.models.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BaseTestConfig {

    // Exemples de variables globales pour les tests
    protected  static User userSubscriber;
    protected static Post post;
    protected  static PostDto postDto;
    protected  static Topic topic;


    // Configuration de Mockito pour chaque test
    public static void initMocks() {
        userSubscriber = User.builder().id(1L).email("test@gmail.com").firstName("Joseph").lastName("Smith").password("pwd").build();
        post = Post.builder().title("Un livre sur typescript")
                .content("un langage orienté objet")
                .topic(Topic.builder().subject("Java").build()).author(userSubscriber).build();
        postDto = PostDto.builder().title("Un livre sur typescript")
                .content("un langage orienté objet").topicSubject("Java").build();
        topic = Topic.builder().subject("Java").build();
    }
}