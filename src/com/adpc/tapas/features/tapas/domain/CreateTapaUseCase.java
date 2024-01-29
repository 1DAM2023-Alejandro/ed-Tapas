package com.adpc.tapas.features.tapas.domain;

public class CreateTapaUseCase {

    private TapaRepository tapaRepository;

    public CreateTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public void execute(Tapa tapa){
        this.tapaRepository.createTapa(tapa);
    }
}
