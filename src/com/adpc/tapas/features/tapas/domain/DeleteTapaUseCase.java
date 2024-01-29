package com.adpc.tapas.features.tapas.domain;

public class DeleteTapaUseCase {

    private TapaRepository tapaRepository;

    public DeleteTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public void execute(String id){
        tapaRepository.deleteTapa(id);
    }
}
