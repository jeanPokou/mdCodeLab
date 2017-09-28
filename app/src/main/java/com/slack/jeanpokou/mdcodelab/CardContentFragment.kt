package com.slack.jeanpokou.mdcodelab


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Use the [CardContentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CardContentFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_card_content, container, false)
    }

    companion object {
        class ContentAdapter : RecyclerView.Adapter<ViewHolder>() {

             private  val LENGTH : Int = 18

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                return ViewHolder(LayoutInflater.from(parent.context),parent)
            }

            override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }


            override fun getItemCount(): Int {
                return LENGTH
            }

        }
    }

        class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
                RecyclerView.ViewHolder(inflater.inflate(R.layout.item_card, parent, false))


}
