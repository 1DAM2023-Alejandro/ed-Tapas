package com.adpc.tapas.features.tapas.presentation;

import com.adpc.tapas.features.tapas.data.TapaDataRepository;
import com.adpc.tapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {

    public static void printTapas(){
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        System.out.println(tapas.toString());
    }

    public static void printTapa(String id){
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(id);
        System.out.println(tapa.toString());
    }
    public  static void deleteTapa(String id){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(id);
    }
    public static void createTapa(Tapa tapa){
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        CreateTapaUseCase createTapaUseCase = new CreateTapaUseCase(tapaDataRepository);
        createTapaUseCase.execute(tapa);
    }
    public static void updateTapa (Tapa tapa){
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);

        System.out.println("");
    }
}
