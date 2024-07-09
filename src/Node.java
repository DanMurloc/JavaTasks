
//Бинарное дерево
public class Node<T1 extends Comparable<T1>,T2>  {
    T1 key;
    T2 value;
    Node<T1,T2> left, right;
    // Корень дерева
    private Node root;

    public Node(T1 key, T2 value){
        this.key=key;
        this.value = value;

    }
    public void setRoot(T1 key, T2 value){
        root = new Node<>(key,value);
    }

    public T2 get(T1 k){
        Node<T1,T2> x = root;
        while (x!=null){
            int cmp = k.compareTo(x.key);
            if(cmp==0){
                return x.value;
            }
            else if(cmp<0){
                x = x.left;
            } else{
                x = x.right;
            }

        }
        return null;
    }
    public void add(T1 k, T2 v){
        Node<T1, T2> x = root, y =null;

        while (x!=null){
            int cmp = k.compareTo(x.key);
            if(cmp==0){
                x.value=v;
                return;
            }
            else {
                y=x;
                if (cmp<0){
                    x=x.left;
                } else{
                    x=x.right;
                }
            }
        }
        Node<T1, T2> newNode = new Node<>(k,v);
        if(y==null){
            root= newNode;
        } else {
            if (k.compareTo(y.key)<0){
                y.left = newNode;
            } else {
                y.right = newNode;
            }

        }
    }

    public void remove(T1 k){
        Node<T1,T2> x= root, y =null;
        while (x != null){
            int cmp = key.compareTo(x.key);
                if (cmp==0){
                    break;
                } else {
                    y=x;
                    if (cmp<0){
                            x=x.left;
                    } else{
                            x=x.right;
                    }
                }
        }
       if (x==null){
           return;
       }
       if (x.right==null){
           if (y==null){
               root = x.left;
           } else{
               y.right=x.left;
           }
       } else {
           Node<T1,T2> leftMost = x.right;
           y=null;
           while (leftMost.left!=null){
               y=leftMost;
               leftMost= leftMost.left;
           }
           if (y!=null){
               y.left = leftMost.right;
           } else {
               x.right=leftMost.right;
           }
           x.key = leftMost.key;
           x.value = leftMost.value;
       }
    }
}
