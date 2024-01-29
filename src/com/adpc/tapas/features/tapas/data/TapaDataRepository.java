package com.adpc.tapas.features.tapas.data;

import com.adpc.tapas.features.tapas.domain.Tapa;
import com.adpc.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    private static TapaDataRepository instance = null;

    private ArrayList<Tapa> localTapa = new ArrayList<>();

    private TapaDataRepository() {
        initData();
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapa;
    }

    @Override
    public Tapa obtainTapa(String id) {
        for (Tapa tapa : localTapa) {
            if (tapa.getId().equals(id)) {
                return tapa;
            }
        }
        return null;
    }

    @Override
    public void deleteTapa(String id){
        for(int i = 0; i<localTapa.size(); i++){
            if(localTapa.get(i).getId().equals(id)){
                localTapa.remove(i);
            }
        }
    }

    @Override
    public void createTapa(Tapa tapa) {
        localTapa.add(tapa);
    }

    @Override
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.getId());
        createTapa(tapa);
    }

    private void initData() {
        localTapa.add(new Tapa("1", "Tortilla de patata", "Bar Magalia", "200 pts", 14, 150, "37", "Sal, patata, huevo, cebolla"));
        localTapa.add(new Tapa("2", "Mini Hamburguesa", "Bar Montecarlo", "156 pts", 12, 150, "37", "Carne, pan, tomate, lechuga y huevo"));

    }

    public static TapaDataRepository newInstance() {
        if (instance == null) {
            instance = new TapaDataRepository();
        }
        return instance;
    }
}
