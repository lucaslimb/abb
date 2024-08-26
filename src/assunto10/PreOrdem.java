package assunto10;

public class PreOrdem {

	public static void main(String[] args) {
		NO root = null;
	}
	
	public void preOrdemABB(NO p) {
		if(p!=null) {
			System.out.println("dado: " + p.dado);
			if(p.esq!=null)
				preOrdemABB(p.esq);
			if(p.dir!=null)
				preOrdemABB(p.dir);
		}
	}
	public void emOrdem(NO p) {
		if(p!=null) {
			if(p.esq!=null)
				emOrdem(p.esq);
			System.out.println("dado: " + p.dado);
			if(p.dir!=null)
				emOrdem(p.dir);
		}
	}
	public void posOrdem(NO p) {
		if(p!=null) {
			if(p.esq!=null)
				posOrdem(p.esq);
			if(p.dir!=null)
				posOrdem(p.dir);
			System.out.println("dado: " + p.dado);
		}
	}
}
