package example.irina.exemexampl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random


class DiceRollFragment : Fragment() {

    lateinit var diceImageView: ImageView
    lateinit var rollButton: Button

    private val diceImageList: List<Int> = listOf(
        //Неизменяемые списки List создаются через функцию listOf():
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_dice_roll, container, false)

        diceImageView = view.findViewById(R.id.dice_image_view)
        rollButton = view.findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            diceImageView.setImageResource(diceImageList.random())

        }

        return view
    }


}