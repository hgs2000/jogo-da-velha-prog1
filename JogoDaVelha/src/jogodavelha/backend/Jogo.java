package jogodavelha.backend;

import java.util.Random;

/**
 * Classe principal do backend do jogo. Para o funcionamento do jogo apenas se
 * deve incluir os jogadores e definir se o adversario será ou não o computador,
 * -> algumas regras a serem relevadas: o jogadores de face X sempre começa
 * jogando -> o computador sempre seleciona a face contraria ao jogador humano
 * -> as condições de vitoria são as mesmas do jogo da velha tradicional e são
 * verificadas a cada jogada -> o jogador humano sempre deve ser inserido antes
 * da IA ser chamada
 *
 * @author vicbona (Victor Bona) & hstarosky (Henrique Starosky)
 */
public class Jogo {

    private Peca tabuleiro[][] = new Peca[3][3];
    private Jogador jogadores[] = new Jogador[2];
    private boolean ia = false;
    private Face faceVitoriosa;

    /**
     *
     */
    public Jogo() {

    }

    /**
     * Método que faz a jogada dos jogadores de acordo com a vez, o metodo
     * verifica sempre se o jogo acabou retornando true caso o jogo tenha
     * terminado
     *
     * @param linha A linha escolhida pra jogada.
     * @param coluna A coluna escolhida pra jogada
     * @return boolean para saber se a jogada foi executada com sucesso.
     */
    public boolean fazJogada(int linha, int coluna) {
        Jogador daVez = identificaQuemJoga();
        Peca pecaDaVez = new Peca(daVez.getFaceEscolhida());
        if (ia) {
            if (daVez.getNome().equals("Computador")) {
                fazJogadaIa();
            } else {
                try {
                    colocarPeca(pecaDaVez, linha, coluna);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Posição do tabuleiro ja ocupada por uma peça");
                }
            }
        } else {
            try {
                colocarPeca(pecaDaVez, linha, coluna);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Posição do tabuleiro ja ocupada por uma peça");
            }
        }
        return terminouJogo();
    }

    public void incluirJogador(Jogador jogador) {
        if (jogador.getFaceEscolhida() == Face.X) {
            jogador.setQuemJoga(true);
        }
        if (jogadores[0] == null) {
            jogadores[0] = jogador;
        } else {
            jogadores[1] = jogador;
        }
    }

    /**
     * O método temPeca() avalia se há uma peça no tabuleiro, conforme
     * coordenadas do tabuleiro informadas.
     *
     * @param linha linha destino
     * @param coluna coluna destino
     * @return
     */
    public boolean temPeca(int linha, int coluna) {
        return (tabuleiro[linha][coluna] != null);
    }

    /**
     * O método colocarPeca() coloca uma peça no tabuleiro. Se já houver uma
     * peça naquela posição, o método lança uma
     * exceção(IllegalArgumentException).
     *
     * @param peca
     * @param linha
     * @param coluna x
     */
    public void colocarPeca(Peca peca, int linha, int coluna) {
        if (temPeca(linha, coluna)) {
            throw new IllegalArgumentException("Posição do tabuleiro ja ocupada por uma peça");
        } else {
            tabuleiro[linha][coluna] = peca;
        }
    }

    /**
     * O método obterVencedor() analisa se há algum ganhador, devolvendo a
     * instância de jogador que representa este jogador;
     *
     * @return
     */
    public Jogador obterVencedor() {
        return (jogadores[0].getFaceEscolhida() == faceVitoriosa)
                ? jogadores[0] : jogadores[1];
    }

    /**
     * O método terminouJogo() retorna true se o jogo foi finalizado e não há
     * mais chances de ninguém jogar qualquer peça; Sendo que as condições para
     * que o método retorne true são: a vitoria de algum dos jogadores(dadas as
     * condições verticais, horizontais e diagonais) ou quando o jogo der
     * "velha" onde todas as casas do jogo estão ocupada mas sem nenhuma
     * condição de vitoria.
     *
     * @return
     */
    public boolean terminouJogo() {

        boolean terminou = false;
        int contador = 0;

        for (Peca[] peca : tabuleiro) {
            for (Peca p : peca) {
                if (p != null) {
                    contador++;
                }
            }
        }
        //condição de velha
        if (contador == 9) {
            terminou = true;
        }

        //condições de vitoria
        Peca x = new Peca(Face.X);
        Peca o = new Peca(Face.O);
        // condições horizontais
        if (tabuleiro[0][0] == x && tabuleiro[0][1] == x && tabuleiro[0][2] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[0][0] == o && tabuleiro[0][1] == o && tabuleiro[0][2] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }
        if (tabuleiro[1][0] == x && tabuleiro[1][1] == x && tabuleiro[1][2] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[1][0] == o && tabuleiro[1][1] == o && tabuleiro[1][2] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }
        if (tabuleiro[2][0] == x && tabuleiro[2][1] == x && tabuleiro[2][2] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[2][0] == o && tabuleiro[2][1] == o && tabuleiro[2][2] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }

        //condições verticais
        if (tabuleiro[0][0] == x && tabuleiro[1][0] == x && tabuleiro[2][0] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[0][0] == o && tabuleiro[1][0] == o && tabuleiro[2][0] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }
        if (tabuleiro[0][1] == x && tabuleiro[1][1] == x && tabuleiro[2][1] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[0][1] == o && tabuleiro[1][1] == o && tabuleiro[2][1] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }
        if (tabuleiro[0][2] == x && tabuleiro[1][2] == x && tabuleiro[2][2] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[0][2] == o && tabuleiro[1][2] == o && tabuleiro[2][2] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }

        //condições diagonais
        if (tabuleiro[0][0] == x && tabuleiro[1][1] == x && tabuleiro[2][2] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[0][0] == o && tabuleiro[1][1] == o && tabuleiro[2][2] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }
        if (tabuleiro[0][2] == x && tabuleiro[1][1] == x && tabuleiro[2][0] == x) {
            terminou = true;
            faceVitoriosa = Face.X;
        } else if (tabuleiro[0][2] == o && tabuleiro[1][1] == o && tabuleiro[2][0] == o) {
            terminou = true;
            faceVitoriosa = Face.O;
        }
        return terminou;
    }

    /**
     * O método identificarQuemJoga() retorna qual jogador tem a vez de jogar.
     *
     * @return
     */
    public Jogador identificaQuemJoga() {
        try {
            if (jogadores[0].isQuemJoga() == true) {
                jogadores[0].setQuemJoga(false);
                jogadores[1].setQuemJoga(true);
                return jogadores[0];
            } else {
                jogadores[0].setQuemJoga(true);
                jogadores[1].setQuemJoga(false);
                return jogadores[1];
            }
        } catch (Exception x) {
        }
        return null;
    }

    /**
     * o método hasIa tem como finalidade definir as configurações para que o
     * jogo opere no modo jogador vs maquina habilitando a IA do jogo e
     * definindo seus parametros
     */
    public void hasIa() {
        this.ia = true;
        Jogador ia = new Jogador("Computador", (jogadores[0].getFaceEscolhida() == Face.X) ? Face.O : Face.X);
        incluirJogador(ia);
    }

    public void fazJogadaIa() {
        Random rand = new Random();
        int linha = 0;
        int coluna = 0;
        Peca p = new Peca();
        p.setFace(jogadores[2].getFaceEscolhida());
        if (!terminouJogo()) {
            do {
                linha = rand.nextInt(2);
                coluna = rand.nextInt(2);
            } while (temPeca(linha, coluna));
        }
        colocarPeca(p, linha, coluna);
    }

    /**
     * O método getTabuleiro() retorna o conteúdo do tabuleiro.
     *
     * @return
     */
    public Peca[][] getTabuleiro() {
        return tabuleiro;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setTabuleiro(Peca[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public boolean isIa() {
        return ia;
    }

    public void setIa(boolean ia) {
        this.ia = ia;
    }

    /**
     * Retorna a face que venceu a partida
     *
     * @return face vencedora
     */
    public Face getFaceVitoriosa() {
        return faceVitoriosa;
    }

    public void setFaceVitoriosa(Face faceVitoriosa) {
        this.faceVitoriosa = faceVitoriosa;
    }

}
