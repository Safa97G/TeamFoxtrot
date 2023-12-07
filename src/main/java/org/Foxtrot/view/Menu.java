package org.Foxtrot.view;

import org.Foxtrot.Controllers.PlayerController;

public class Menu {

    private PlayerController playerController;

    public Menu(PlayerController playerController)
    {
        this.playerController = playerController;
    }
    public void ShowMenu(){

        System.out.println("Ange Ett val:");
        System.out.println("lägg till en spelare:");
        System.out.println("Uppdaterar Spelare:");
        System.out.println("Ta bort en Spelare:");
        System.out.println("Hämta all spelarna:");
        handleUserInput();



    }

    private void handleUserInput() {

    }
}
