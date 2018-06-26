package com.florist.repository;

import com.florist.domain.Decoration;
import com.florist.domain.Flower;
import com.florist.domain.Tree;
import java.util.ArrayList;
import java.util.List;


public class ProductRepository {

	private static List<Tree> trees=new ArrayList<>();
        private static List<Flower> flowers=new ArrayList<>();
        private static List<Decoration> decorations=new ArrayList<>();
       
	
	public ProductRepository(){
		
	}
	
	public List<Tree> getAllTrees(){
		return new ArrayList<>(trees);
	}public void addTree(Tree tree) throws Exception{
                if(tree==null) {
                    throw new Exception();
                }
		trees.add(tree);
	}
        public void removeTree(Tree tree) throws Exception{
                if(tree==null) {
                    throw new Exception();
                }
		trees.remove(tree);
	}
        
        public List<Flower> getAllFlowers(){
		return new ArrayList<>(flowers);
	}
        public void addFlower(Flower flower) throws Exception{
                if(flower==null) {
                    throw new Exception();
                }
		flowers.add(flower);
	}
        public void removeFlower(Flower tree) throws Exception{
                if(tree==null) {
                    throw new Exception();
                }
		flowers.remove(tree);
	}
        
        public List<Decoration> getAllDecorations(){
		return new ArrayList<>(decorations);
	}
        public void addDecoration(Decoration decoration) throws Exception{
                if(decoration==null) {
                    throw new Exception();
                }
		decorations.add(decoration);
	}
        public void removeDecoration(Decoration decoration) throws Exception{
                if(decoration==null) {
                    throw new Exception();
                }
		decorations.remove(decoration);
	}
	
	
}

