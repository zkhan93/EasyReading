package nu.info.zeeshan.rnf;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentAbout extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.about_fragment, container,
				false);
		((SettingsActivity) getActivity()).getSupportActionBar().setTitle(
				R.string.action_about);
		return rootView;
	}
}
