package com.example.menuandroid

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import java.lang.Exception

class CustomMenu {

    fun showMenu (context : Context, view :View){


        val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menu_items)

        pop.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.item1 -> {Toast.makeText(context, "Product", Toast.LENGTH_SHORT).show()
            true
            }
                R.id.item2 -> {Toast.makeText(context, "Product", Toast.LENGTH_SHORT).show()
            true
                }
                R.id.item3 -> {Toast.makeText(context, "Product", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.item4 ->{ Toast.makeText(context, "Product", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> {false}
            }

            // second method
//            R.id.item4 ->{ Toast.makeText(context, "Product", Toast.LENGTH_SHORT).show()
//            true
//            }

        }
        try {
            val fieldMpopup = PopupMenu::class.java.getField("popup")
            fieldMpopup.isAccessible = true
            val mpopup = fieldMpopup.get(pop)
            mpopup.javaClass
                .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
                .invoke(mpopup,true)


        }catch (e:Exception){ }

        finally {
            pop.show()
        }
    }
}