package io.github.yavski.fabspeeddial;

import android.support.design.internal.NavigationMenu;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.view.MenuItem;

/**
 * This adapter class provides empty implementations of the methods from
 * {@link FabSpeedDial.MenuListener}.
 * Created by yavorivanov on 03/01/2016.
 */
public class SimpleMenuListenerAdapter implements FabSpeedDial.MenuListener {

    @Override
    public boolean onPrepareMenu(NavigationMenu navigationMenu) {

        return true;
    }

    @Override
    public boolean onMenuItemSelected(MenuItem menuItem, FloatingActionButton button, CardView cardView) {
        return false;
    }

    @Override
    public void onMenuItemCreated(MenuItem menuItem, FloatingActionButton selectedButton, CardView selectedCardView) {
    }

    @Override
    public void onMenuClosed() {
    }
}
