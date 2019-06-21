package com.sda.rest_api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest     // adnotacja oznacz, że test zarządzany jest przes Springa
@AutoConfigureMockMvc   // konfiguruje nasz obiekt MockMvc dzięki, któremu możmy wykonywac zapytania
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)   //czyści naszą bazę za każdym razem i
                                                                                // uruchamia od nowa (izoluje nasze testy)

public class LibraryIntegrationTest {

    @Autowired      // wstrzyknięcie zależności
    private MockMvc mockMvc;

    @DisplayName("gdy wywołujemy GET na api/books, gdy nie ma żadnych ksiązek w bazie danych" +
            "to zwróci nam pustą tablice")
    @Test
    void test1() throws Exception {
        mockMvc.perform(get("/api/books"))          // test wykonuje zapytanie GET na adres /api/books

        .andExpect(status().isOk())                          // sprawdzamy czy status jest OK
        .andExpect(content().string("[]"));     // oraz czy zwraca nam pustą tablice
    }
}
