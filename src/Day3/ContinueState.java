package Day3;

public class ContinueState {

	public static void main(String[] args) {
		int iOuter;
		for(iOuter=0;iOuter<2;iOuter++) {
			for(int jInner=0;jInner<2;jInner++) {
				if(iOuter==jInner)
					continue;
				System.out.println(iOuter+" "+jInner);
			}
		}

	}

}
//output is
//0 1
//1 0
