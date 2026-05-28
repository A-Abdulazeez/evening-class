public class PyramidStar{
public static void main(String[]args){


for (int rowStarSign = 1; rowStarSign<=9;rowStarSign++){
for (int columnStarSign = 9; columnStarSign>=1;columnStarSign--){
if (rowStarSign >= columnStarSign){
System.out.print(" *");
}
else{
System.out.print(" ");
}

}
System.out.println();
}

}

}
