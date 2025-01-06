package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://picsum.photos/200/300"),
        User("002", "Paul", "https://picsum.photos/200/301"),
        User("003", "Phil", "https://picsum.photos/200/302"),
        User("004", "Guillaume", "https://picsum.photos/200/303"),
        User("005", "Francis", "https://picsum.photos/200/304"),
        User("006", "George", "https://picsum.photos/200/304"),
        User("007", "Louis", "https://picsum.photos/200/305"),
        User("008", "Mateo", "https://picsum.photos/200/306"),
        User("009", "April", "https://picsum.photos/200/307"),
        User("010", "Louise", "https://picsum.photos/200/308"),
        User("011", "Elodie", "https://picsum.photos/200/309"),
        User("012", "Helene", "https://picsum.photos/200/310"),
        User("013", "Fanny", "https://picsum.photos/200/311"),
        User("014", "Laura", "https://picsum.photos/200/312"),
        User("015", "Gertrude", "https://picsum.photos/200/313"),
        User("016", "Chloé", "https://picsum.photos/200/314"),
        User("017", "April", "https://picsum.photos/200/315"),
        User("018", "Marie", "https://picsum.photos/200/316"),
        User("019", "Henri", "https://picsum.photos/200/317"),
        User("020", "Rémi", "https://picsum.photos/200/318")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://picsum.photos/200/319"),
        User("022", "Geoffrey", "https://picsum.photos/200/320"),
        User("023", "Simon", "https://picsum.photos/200/321"),
        User("024", "André", "https://picsum.photos/200/322"),
        User("025", "Leopold", "https://picsum.photos/200/323")
    )
}