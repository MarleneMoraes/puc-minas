class Veiculo {
  int anoFabricacao;
  char placa;
  double kmRodados;

  public:
  Veiculo (const int af, char p);

  void setAnoFabricacao (int af){
    anoFabricacao = af;
  }

  int getAnoFabricacao (int af){
    return anoFabricacao;
  }

  void setPlaca (char p){
    placa = p;
  }

  char getPlaca (char p){
    return placa;
  }

  void setKmRodados (double kr){
    kmRodados = kr;
  }

  double getKmRodados (double kr){
    return kmRodados;
  }
}; 

class Caminhao: public Veiculo {
  int numeroPneus;
  double valorBase; 

  public:
  Caminhao (const int np, double vb);

  void setNumeroPneus (int np){
    numeroPneus = np;
  }

  int getNumeroPneus (int np){
    return numeroPneus;
  }

  void setValorBase (double vb){
    valorBase = vb;
  }

  double getValorBase (double vb){
    return valorBase;
  }

  double freteVeiculos(double kr, int np, double vb) {
    return kr*np*vb;
  }
}; 

class Carro: public Veiculo {
  char modelo;
  double valorBandeirada;
  double valorBase; 

  public:
  Carro (const char m, double vban, double vbas);

  void setModelo (char m){
    modelo = m;
  }

  char getModelo (char m){
    return modelo;
  }

  void setValorBandeirada (double vban){
    valorBandeirada = vban;
  }

  double getValorBandeirada (double vban){
    return valorBandeirada;
  }

  void setValorBase (double vb){
    valorBase = vb;
  }

  double getValorBase (double vb){
    return valorBase;
  }

  double freteVeiculos(double vban, double kr, double vb) {
    return vban + (kr*vb);
  }
}; 