/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial;

import ru.vguit.tutorial.db.DBDerby;
import ru.vguit.tutorial.persistens.Buy;
import ru.vguit.tutorial.persistens.Featuregames;
import ru.vguit.tutorial.persistens.Seasonsale;
import ru.vguit.tutorial.persistens.Systemrequirements;
import ru.vguit.tutorial.persistens.Userssteam;

/**
 * Главный класс программы, представляет собой точку входа в программу
 *
 * @author a.pleshkanev
 */
public class Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DBDerby db = new DBDerby();

        Buy game = new Buy("Hill", "Bioshok Infinite", "01.07.2014");

        db.addBuy(game);
        
        DBDerby dbd = new DBDerby();

        Userssteam user = new Userssteam("Ольга", "#KPPPPD#", "Старый Оскол", "fgybhunj.edc1996@mail.ru");

        dbd.addUserssteam(user);
        
        DBDerby dbdb = new DBDerby();

        Seasonsale games = new Seasonsale("Bioshok Infinite", 30, 699, 489);

        dbdb.addSeasonsale(games);
        
        DBDerby q = new DBDerby();

        Systemrequirements system = new Systemrequirements("Battlefield: Hardline", "Windows 7", "8 GB", "30 GB", "3 GB", "10", "4 ядра", "3 GHz");

        q.addSystemrequirements(system);
        
        DBDerby w = new DBDerby();

        Featuregames featur = new Featuregames("Battlefield: Hardline", "Shooter", "EA Digital Illusion", "Electronic Arts", "17.03.2015", 8, 0, "2000 RUB");

        w.addFeaturegames(featur);

        //Point pDataBase = db.find(1L);

       // System.err.println("X = " + pDataBase.getX() + "Y = " + pDataBase.getY());
    }

}
