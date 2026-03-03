class TV{
    int tamanho;
    int volume = 5;
    String marca;
    int voltagem;
    int canal;

    int aumentarVolume(){
        if (volume < 10){
            volume++;
        }
        return volume;
    }
}
