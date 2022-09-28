package guru.qa;

public class Main {

    public static void main(String[] args) {
        Brand inStockBrands = new Brand();
        inStockBrands.addNewBrand("Chanel");
        inStockBrands.addNewBrand("Gucci");
        inStockBrands.addNewBrand("Valentino");
        inStockBrands.addNewBrand("Gucci");
        inStockBrands.removePosition("Gucci");
        inStockBrands.searchForBrand("Valentino");
        inStockBrands.printAllBrands();
        System.out.println("");
        VolleyballTeam volleyballTeam = new VolleyballTeam();
        volleyballTeam.addNewMemberToTheTeam("Kate");
        volleyballTeam.addNewMemberToTheTeam("Marya");
        volleyballTeam.addNewMemberToTheTeam("Tanya");
        volleyballTeam.addNewMemberToTheTeam("Anne");
        volleyballTeam.addNewMemberToTheTeam("Luiza");
        volleyballTeam.addNewMemberToTheTeam("Alex");
        volleyballTeam.removeMember("Jenya");
        volleyballTeam.findMember("Kate");
        volleyballTeam.printAllMembers();
        System.out.println("");
        BoardGames boardGames = new BoardGames();
        boardGames.addNewBoardGame("Carcasson", 85);
        boardGames.addNewBoardGame("Inis", 215);
        boardGames.addNewBoardGame("Azul", 165);
        boardGames.removeNewBoardGame("Azul");
        boardGames.findPriceOfBoardGame("Inis");
        boardGames.printAllBoardGames();
        System.out.println(" ");
        ClassRegister classRegister = new ClassRegister();
        classRegister.addNewStudent("Yamazaki Kento");
        classRegister.addNewStudent("Oyakawa Rei");
        classRegister.addNewStudent("Uzumaki John");
        classRegister.addNewStudent("Mishou Gin");
        classRegister.addNewStudent("Nonde Onda");
        classRegister.removeNewStudent("Uzumaki John");
        classRegister.printAllStudents();


    }

}
