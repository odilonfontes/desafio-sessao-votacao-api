package br.com.odilonfontes.desafiosessaovotacaopautaapi.web.rest;

import br.com.odilonfontes.desafiosessaovotacaopautaapi.service.PautaService;
import br.com.odilonfontes.desafiosessaovotacaopautaapi.service.dto.PautaDTO;
import br.com.odilonfontes.desafiosessaovotacaopautaapi.service.impl.PautaServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.mockito.BDDMockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @SpringBootTest
// @AutoConfigureMockMvc
public class PautaResourceTest {

    public static final String URI_PAUTA = "/api/v1/pauta";
    static MockMvc mockMvc;
    static ObjectMapper objectMapper;
    static PautaService pautaServiceMock;

    @BeforeAll
    static void inicializarContexto() {
        // pautaServiceMock = mock(PautaServiceImpl.class);
        // mockMvc = MockMvcBuilders
        //         .standaloneSetup(new PautaResource(pautaServiceMock))
        //         .build();
        // objectMapper = new ObjectMapper();
    }

    @DisplayName("Ao chamar método criarPauta")
    @Nested
    class AoChamarMetodoCriar {
        PautaDTO pautaDTO;

        @BeforeEach
        void inicializarContexto() {
            pautaDTO = new PautaDTO();
        }

        @DisplayName("Dado que possua dados válidos, deveria criar uma nova pauta")
        @Test
        void criarPauta() throws Exception {
            // BDDMockito.given(pautaServiceMock.salvar(any())).willReturn(pautaDTO);
            // ResultActions resultActions = PautaResourceTest.criarPauta(pautaDTO);
            // resultActions.andExpect(status().isCreated());
            // BDDMockito.verify(pautaServiceMock, times(1)).salvar(any());
        }

        @DisplayName("Dado que possua dados inválidos, deveria retornar erro 400")
        @Test
        void retornarErro400() throws Exception {
            // ResultActions resultActions = PautaResourceTest.criarPauta(pautaDTO);
            // resultActions.andExpect(status().isBadRequest());
        }
    }

    static ResultActions criarPauta(PautaDTO pautaDTO) throws Exception {
        return mockMvc.perform(MockMvcRequestBuilders.post(URI_PAUTA)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(pautaDTO)));
    }

    // @DisplayName("Ao chamar método consultarTodasPautas")
    // @Nested
    // class AoChamarMetodoConsultarPautas {
    //     @BeforeEach
    //     void inicializarContexto() {

    //     }
        
    //     @DisplayName("Dado que possua pautas cadastradas, deveria retornar todas as pautas")
    //     @Test
    //     void consultarTodasPautas() throws Exception {
            // BDDMockito.given(pautaServiceMock.consultarTodas()).willReturn(pautaDTO);
            // ResultActions resultActions = PautaResourceTest.criarPauta(pautaDTO);
            // resultActions.andExpect(status().isCreated());
            // BDDMockito.verify(pautaServiceMock, times(1)).salvar(any());
    //     }
    // }

}
