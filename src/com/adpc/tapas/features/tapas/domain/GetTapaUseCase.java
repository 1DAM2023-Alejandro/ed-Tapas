package com.adpc.tapas.features.tapas.domain;

public class GetTapaUseCase {

    private TapaRepository tapaRepository;

    public GetTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public Tapa execute(String id) {
        return this.tapaRepository.obtainTapa(id);
    }
}
