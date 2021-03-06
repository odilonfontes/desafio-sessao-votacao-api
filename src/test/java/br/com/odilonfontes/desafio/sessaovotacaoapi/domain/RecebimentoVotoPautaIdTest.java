package br.com.odilonfontes.desafio.sessaovotacaoapi.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RecebimentoVotoPautaIdTest {

    @DisplayName("Ao instanciar objetos da classe RecebimentoVotoPautaId")
    @Nested
    class AoInstanciarObjetosDaClasseRecebimentoVotoPautaId {
        RecebimentoVotoPautaId recebimentoVotoPautaId1;
        RecebimentoVotoPautaId recebimentoVotoPautaId2;

        @BeforeEach
        void inicializarContexto() {
            recebimentoVotoPautaId1 = new RecebimentoVotoPautaId();
            recebimentoVotoPautaId2 = new RecebimentoVotoPautaId();
        }

        @DisplayName("Dado que possuam mesmo estado, deveriam ser iguais")
        @Test
        void verificarSeEstaoIguais() {
            SessaoVotacao sessaoVotacao = new SessaoVotacao();
            recebimentoVotoPautaId1.setSessaoVotacao(sessaoVotacao);
            Associado associado = new Associado();
            recebimentoVotoPautaId1.setAssociado(associado);
            recebimentoVotoPautaId2.setSessaoVotacao(recebimentoVotoPautaId1.getSessaoVotacao());
            recebimentoVotoPautaId2.setAssociado(recebimentoVotoPautaId1.getAssociado());
            assertThat(recebimentoVotoPautaId1).isEqualTo(recebimentoVotoPautaId2);
        }
    }

}
