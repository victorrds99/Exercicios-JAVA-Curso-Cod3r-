package oo.herenca;

public class Jogador {
	
	protected int vida = 100;
	public int x;
	public int y;
	
	public String vidaMonstro() {
		return "O monstro tem =>" + vida;
	}
	
	public String vidaHeroi() {
		return "O Heroi tem =>"+ vida;
	}
	
	protected boolean atacar(Jogador oponente) {
		int deltaX = Math.abs( x - oponente.x);
		int deltaY = Math.abs( y - oponente.y);
		
		if (deltaX == 0 && deltaY ==1 ) {
			oponente.vida -= 10;
			return true;
		}else if (deltaX ==1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
		
	}
	
	protected boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
//		if(direcao == Direcao.NORTE) {
//			y++;
//		}
		
		return true;
	}
}
