package ru.sgs.fireman.Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.sgs.fireman.utlis.Font;

public class ButtonAndroid {

    private Font font;

    public ButtonAndroid(){
        font = new Font();
    }

    public void render(SpriteBatch batch){
        font.printText(
                batch,
                "To start the game, click on the screen",
                3,
                Gdx.app.getGraphics().getWidth()/2-(font.getFontSize(3)*11.5f),
                Gdx.app.getGraphics().getHeight()/2
        );
    }

    public void dispose(){

    }
}