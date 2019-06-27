import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Adapter_custom extends RecyclerView.Adapter<Adapter_custom.MyViewHolder> {

    String name[];
    Context context;
    Integer avatar[];
    public class Adapter_custom(Context context,String[] name,Integer avatar[])
    {
        this.name=name;
        this.avatar=avatar
        this.context=context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
 }
