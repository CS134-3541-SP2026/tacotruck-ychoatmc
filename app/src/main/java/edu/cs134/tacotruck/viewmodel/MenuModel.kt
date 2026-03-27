package edu.cs134.tacotruck.viewmodel

import androidx.lifecycle.ViewModel
import edu.cs134.tacotruck.model.Menu
import edu.cs134.tacotruck.model.MenuItem

class MenuModel() : ViewModel(
) {
    private val _menu = Menu()
    val menu: List<MenuItem> = _menu.menuItems
}
