package com.techno.databindingmvvm.Adapter;

 import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

 import com.techno.databindingmvvm.BR;
 import com.techno.databindingmvvm.Model.TemperatureData;
import com.techno.databindingmvvm.R;

 import java.util.List;

/**
 * Created by Arbaz.
 * Date: 30/3/18
 * Time: 3:12 PM
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<TemperatureData> data;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private final ViewDataBinding binding;
        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Object obj) {
            binding.setVariable(BR.obj,obj);
            binding.executePendingBindings();
        }
    }

     public MyAdapter(List<TemperatureData> myDataset) {
        data = myDataset;
    }

     @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new MyViewHolder(binding);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final TemperatureData temperatureData = data.get(position);
        holder.bind(temperatureData);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return data.size();
    }

}
