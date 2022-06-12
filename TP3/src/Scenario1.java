

public class Scenario1 {
public int multiplicateur(int x, int y) {
int result = 0;
if( x == 0 ) { // if x is equal to 0
result = 0;
}
else if( x < 0 ) {// if x is a negative value
result = -x * y;
}
else if( y < 0 ) {// if y is a negative value
result = x * (-y);
}
else { // if it's normal
result = x * y;
}
return result;
}
}