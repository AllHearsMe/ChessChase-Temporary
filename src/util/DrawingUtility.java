package util;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import model.BishopEnemy;
import model.EntityState;
import model.Field;
import model.KingEnemy;
import model.KnightEnemy;
import model.PawnEnemy;
import model.Player;
import model.QueenEnemy;
import model.RookEnemy;

public class DrawingUtility
{
	private static void drawSprite(GraphicsContext gc, Image sprite, EntityState state, int spriteCounter, double x, double y, int facing)
	{
		if(state == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) spriteCounter / Config.DYING_FRAMES);
		gc.scale(facing, 1);
		gc.drawImage(sprite, facing * x, y);
		gc.setGlobalAlpha(1);
		gc.scale(1, 1);
	}
	
	public static void drawField(GraphicsContext gc, Field field)
	{
		Image background = ResourceLoader.getInstance().getFieldBackground();
		gc.setFill(new ImagePattern(background, 0, 0, background.getWidth() / field.getWidth(), background.getHeight() / field.getHeight(), true));
		gc.fillRect(-field.getX(), -field.getY(), field.getWidth(), field.getHeight());
	}
	
	public static void drawPlayer(GraphicsContext gc, Player player, Field field)
	{
//		if(player.getState() == EntityState.DYING)
//			gc.setGlobalAlpha(1 - (double) player.getSpriteCounter() / Config.DYING_FRAMES);
//		gc.drawImage(ResourceLoader.getInstance().getPlayerSprite(player.getState(), player.getSpriteCounter()), 
//				player.getDrawX() - field.getX(), player.getDrawY() - field.getY());
//		gc.setGlobalAlpha(1);
		drawSprite(gc, ResourceLoader.getInstance().getPlayerSprite(player.getState(), player.getSpriteCounter()), player.getState(), player.getSpriteCounter(), player.getDrawX() - field.getX(), player.getDrawY() - field.getY(), player.getDx() < 0 ? -1 : 1);
	}
	
	public static void drawPawn(GraphicsContext gc, PawnEnemy pawn, Field field)
	{
		if(pawn.getState() == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) pawn.getSpriteCounter() / Config.DYING_FRAMES);
		gc.drawImage(ResourceLoader.getInstance().getPlayerSprite(pawn.getState(), pawn.getSpriteCounter()), 
				pawn.getDrawX() - field.getX(), pawn.getDrawY() - field.getY());
		gc.setGlobalAlpha(1);
	}
	
	public static void drawRook(GraphicsContext gc, RookEnemy rook, Field field)
	{
		if(rook.getState() == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) rook.getSpriteCounter() / Config.DYING_FRAMES);
		gc.drawImage(ResourceLoader.getInstance().getPlayerSprite(rook.getState(), rook.getSpriteCounter()), 
				rook.getDrawX() - field.getX(), rook.getDrawY() - field.getY());
		gc.setGlobalAlpha(1);
	}
	
	public static void drawKnight(GraphicsContext gc, KnightEnemy knight, Field field)
	{
		if(knight.getState() == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) knight.getSpriteCounter() / Config.DYING_FRAMES);
		gc.drawImage(ResourceLoader.getInstance().getKnightSprite(knight.getState(), knight.getSpriteCounter()), 
				knight.getDrawX() - field.getX(), knight.getDrawY() - field.getY());
		gc.setGlobalAlpha(1);
	}
	
	public static void drawBishop(GraphicsContext gc, BishopEnemy bishop, Field field)
	{
		if(bishop.getState() == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) bishop.getSpriteCounter() / Config.DYING_FRAMES);
		gc.drawImage(ResourceLoader.getInstance().getPlayerSprite(bishop.getState(), bishop.getSpriteCounter()), 
				bishop.getDrawX() - field.getX(), bishop.getDrawY() - field.getY());
		gc.setGlobalAlpha(1);
	}
	
	public static void drawQueen(GraphicsContext gc, QueenEnemy queen, Field field)
	{
		if(queen.getState() == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) queen.getSpriteCounter() / Config.DYING_FRAMES);
		gc.drawImage(ResourceLoader.getInstance().getQueenSprite(queen.getState(), queen.getSpriteCounter()), 
				queen.getDrawX() - field.getX(), queen.getDrawY() - field.getY());
		gc.setGlobalAlpha(1);
	}
	
	public static void drawKing(GraphicsContext gc, KingEnemy king, Field field)
	{
		if(king.getState() == EntityState.DYING)
			gc.setGlobalAlpha(1 - (double) king.getSpriteCounter() / Config.DYING_FRAMES);
		gc.drawImage(ResourceLoader.getInstance().getKingSprite(king.getState(), king.getSpriteCounter()), 
				king.getDrawX() - field.getX(), king.getDrawY() - field.getY());
		gc.setGlobalAlpha(1);
	}
}
