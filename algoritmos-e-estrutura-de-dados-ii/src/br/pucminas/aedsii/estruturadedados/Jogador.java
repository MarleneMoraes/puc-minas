package br.pucminas.aedsii.estruturadedados;

public class Jogador {

    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    public Jogador() { }

    public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento,
            String cidadeNascimento, String estadoNascimento) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.universidade = universidade;
        this.anoNascimento = anoNascimento;
        this.cidadeNascimento = cidadeNascimento;
        this.estadoNascimento = estadoNascimento;
    }

    public boolean verificarJogador(int id) {
        if (this.id == id)
            return true;

        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public Jogador clone() throws CloneNotSupportedException {
        return (Jogador) super.clone();
    }

    public static Jogador ler(String linha) {
        Jogador jogador = new Jogador();
        String[] strings = new String[8];
        String[] data = linha.split(",");

        for (int i = 0; i < strings.length; i++) {
            if (i >= data.length || data[i].equals("")) {
                strings[i] = "";
            } else {
                strings[i] = data[i];
            }
        }

        jogador.setId(Integer.parseInt(strings[0]));
        jogador.setNome(strings[1]);

        return infoVazia(jogador, strings);
    }

    public static Jogador infoVazia(Jogador jogador, String[] strings) {
        jogador.setId(Integer.parseInt(strings[0]));
        jogador.setNome(strings[1]);

        if (strings[2].equals("")) {
            jogador.setAltura(-1);
        } else {
            jogador.setAltura(Integer.parseInt(strings[2]));
        }

        if (strings[3].equals("")) {
            jogador.setPeso(-1);
        } else {
            jogador.setPeso(Integer.parseInt(strings[3]));
        }

        if (strings[4].equals("")) {
            jogador.setUniversidade("nao informado");
        } else {
            jogador.setUniversidade(strings[4]);
        }

        if (strings[5].equals("")) {
            jogador.setAnoNascimento(-1);
        } else {
            jogador.setAnoNascimento(Integer.parseInt(strings[5]));
        }

        if (strings[6].equals("")) {
            jogador.setCidadeNascimento("nao informado");
        } else {
            jogador.setCidadeNascimento(strings[6]);
        }

        if (strings.length <= 7 || strings[7].equals("")) {
            jogador.setEstadoNascimento("nao informado");
        } else {
            jogador.setEstadoNascimento(strings[7]);
        }

        return jogador;
    }

    public void imprimir() {
        StringBuilder printString = new StringBuilder();

        printString.append("[" + this.getId() + " ## " + this.getNome() + " ## ");

        if (this.getAltura() < 0) {
            printString.append("nao informado ## ");
        } else {
            printString.append(this.getAltura() + " ## ");
        }

        if (this.getPeso() < 0) {
            printString.append("nao informado ## ");
        } else {
            printString.append(this.getPeso() + " ## ");
        }

        if (this.getAnoNascimento() < 0) {
            printString.append("nao informado ## ");
        } else {
            printString.append(this.getAnoNascimento() + " ## ");
        }

        printString.append(this.getUniversidade() + " ## ");

        printString.append(this.getCidadeNascimento() + " ## ");

        printString.append(this.getEstadoNascimento() + "]");

        System.out.println(printString);
    }
}