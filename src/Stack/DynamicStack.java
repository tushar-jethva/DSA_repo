package Stack;

public class DynamicStack extends StackIsCustom {
    //it will never full as  we do its size double

    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        //as it full double the size
        if(isFull(data)){
            int[] tempArr = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                tempArr[i] = data[i];
            }
            data = tempArr;
        }
        return super.push(item);
    }


}
