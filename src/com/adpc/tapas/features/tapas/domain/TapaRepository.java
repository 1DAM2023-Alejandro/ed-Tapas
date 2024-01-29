package com.adpc.tapas.features.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {

    ArrayList<Tapa> obtainTapas();

    Tapa obtainTapa(String id);
    void deleteTapa(String tapaId);
    void createTapa(Tapa tapa);

    void updateTapa(Tapa tapa);
}
