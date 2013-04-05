package edu.uchicago.cs.gerber.layout;



import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends ListActivity {
    /** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ArrayAdapter<String> adpArray = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, new String[] {
						"LinearLayout Example", 
						"RelativeLayout  Example",
						"GridLayout Example"
						 });

		adpArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		this.setListAdapter(adpArray);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Intent itn = null;
		
		switch (position) {
		case 0:
			
			itn = new Intent(this, LinearLayoutEx.class);
			break;
		case 1:
			
			itn = new Intent(this, RelativeLayoutEx.class);
			break;

		case 2:
			itn = new Intent(this, GridLayoutEx.class);
			break;
		}
		
		if (itn != null){
			startActivity(itn);
		}

		
	}
}


