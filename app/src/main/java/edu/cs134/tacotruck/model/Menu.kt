package edu.cs134.tacotruck.model

import kotlinx.coroutines.flow.StateFlow
import edu.cs134.tacotruck.model.MenuItem

class Menu {
    val menuItems = listOf<MenuItem>(
    MenuItem("🌮 Taco", 3.0),
    MenuItem("🌯 Burrito", 7.0),
    MenuItem("🥑 Guacamole", 2.5),
    MenuItem("🥛 Horchata", 2.0),
    MenuItem("🌯 Quesadilla", 5.0))
}