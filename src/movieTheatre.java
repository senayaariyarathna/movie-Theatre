import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class movieTheatre {
    private static int[] row_1= new int[13]; //creating a 1st row with 12 seats
    private static int[] row_2= new int[17]; //creating a 2nd row with 16 seats
    private static int[] row_3= new int[21]; //creating a 3rd row with 20 seats
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the New Theatre");


        for(int i=1; i<row_1.length;i++){
            row_1[i]=0;
        }
        for(int i=1; i<row_2.length;i++){
            row_2[i]=0;
        }
        for(int i=1; i<row_3.length;i++){
            row_3[i]=0;
        }
        boolean theatre = true;
        while (theatre){
            System.out.println("__________________");
            System.out.println();
            System.out.println("Please select an option: ");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket");
            System.out.println("4) List available seats");
            System.out.println("5) Save to file");
            System.out.println("6) Load from file");
            System.out.println("7) Print ticket information and total price");
            System.out.println("8) Sort tickets by price");
            System.out.println("0) Quit");
            System.out.println();
            System.out.println("__________________");
            System.out.println("Enter option: ");
            int option = input.nextInt();

            if(option == 0){
                theatre = false;
            }
            switch (option) {
                case 1:
                    BuyTicket(); //buy a ticket
                    break;
                case 2:
                    PrintSeatingArea();// print a seating area
                    break;
                case 3:
                    CancelTickets();
                    break;
                case 4:
                    ShowAvailable();
                    break;
                case 5:
                    save();
                    break;
                case 6:
                    load();
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }

        }
    }

    //case 1 method
    public static void BuyTicket(){

        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a row number: ");
        int row = input1.nextInt();
        System.out.print("Enter seat number: ");
        int seat = input1.nextInt();

        if(row<1 || row>3 || seat<1 || (row==1 && seat>12) || (row==2 && seat>16) || (row == 3 && seat>20)){
            System.out.println("Invalid seat or row"); //checked whether the seat no. and row no. are valid
            return;
        }
        //checking seats are available
        int[] selected_row = null;
        switch (row){
            case 1:
                selected_row = row_1;
                break;
            case 2:
                selected_row = row_2;
                break;
            case 3:
                selected_row = row_3;
                break;
        }

        if(selected_row[seat] == seat){
            System.out.println("Seat already taken");
        }else{
            System.out.println(" Seat " + seat + " in row " + row + " has been reserved.");
        }

        if( row == 1){
            switch(seat){
                case 1:
                    selected_row[1]=seat;
                    break;
                case 2:
                    selected_row[2]=seat;
                    break;
                case 3:
                    selected_row[3]=seat;
                    break;
                case 4:
                    selected_row[4]=seat;
                    break;
                case 5:
                    selected_row[5]=seat;
                    break;
                case 6:
                    selected_row[6]=seat;
                    break;
                case 7:
                    selected_row[7]=seat;
                    break;
                case 8:
                    selected_row[8]=seat;
                    break;
                case 9:
                    selected_row[9]=seat;
                    break;
                case 10:
                    selected_row[10]=seat;
                    break;
                case 11:
                    selected_row[11]=seat;
                    break;
                case 12:
                    selected_row[12]=seat;
                    break;
            }
        }else if ( row == 2){
            switch(seat){
                case 1:
                    selected_row[1]=seat;
                    break;
                case 2:
                    selected_row[2]=seat;
                    break;
                case 3:
                    selected_row[3]=seat;
                    break;
                case 4:
                    selected_row[4]=seat;
                    break;
                case 5:
                    selected_row[5]=seat;
                    break;
                case 6:
                    selected_row[6]=seat;
                    break;
                case 7:
                    selected_row[7]=seat;
                    break;
                case 8:
                    selected_row[8]=seat;
                    break;
                case 9:
                    selected_row[9]=seat;
                    break;
                case 10:
                    selected_row[10]=seat;
                    break;
                case 11:
                    selected_row[11]=seat;
                    break;
                case 12:
                    selected_row[12]=seat;
                    break;
                case 13:
                    selected_row[13]=seat;
                    break;
                case 14:
                    selected_row[14]=seat;
                    break;
                case 15:
                    selected_row[15]=seat;
                    break;
                case 16:
                    selected_row[16]=seat;
                    break;


            }
        }else if( row == 3){
            switch(seat){
                case 1:
                    selected_row[1]=seat;
                    break;
                case 2:
                    selected_row[2]=seat;
                    break;
                case 3:
                    selected_row[3]=seat;
                    break;
                case 4:
                    selected_row[4]=seat;
                    break;
                case 5:
                    selected_row[5]=seat;
                    break;
                case 6:
                    selected_row[6]=seat;
                    break;
                case 7:
                    selected_row[7]=seat;
                    break;
                case 8:
                    selected_row[8]=seat;
                    break;
                case 9:
                    selected_row[9]=seat;
                    break;
                case 10:
                    selected_row[10]=seat;
                    break;
                case 11:
                    selected_row[11]=seat;
                    break;
                case 12:
                    selected_row[12]=seat;
                    break;
                case 13:
                    selected_row[13]=seat;
                    break;
                case 14:
                    selected_row[14]=seat;
                    break;
                case 15:
                    selected_row[15]=seat;
                    break;
                case 16:
                    selected_row[16]=seat;
                    break;
                case 17:
                    selected_row[17]=seat;
                    break;
                case 18:
                    selected_row[18]=seat;
                    break;
                case 19:
                    selected_row[19]=seat;
                    break;
                case 20:
                    selected_row[20]=seat;
                    break;
            }
        }
    }

    //case 2 method
    public static void PrintSeatingArea(){
        System.out.println("\t*****");
        System.out.println("\t*  STAGE  *");
        System.out.println("\t*****");
        System.out.println();

        System.out.print("\t");
        for(int i =1;i<(row_1.length+1)/2; i++){
            if(row_1[i]==0){
                System.out.print("O");
            }else{
                System.out.print("X");
            }
        }
        System.out.print(" ");
        for(int i =7;i<row_1.length; i++){
            if(row_1[i]==0){
                System.out.print("O");
            }else{
                System.out.print("X");
            }
        }
        System.out.println();


        System.out.print(" "+" ");
        for(int i =1;i<(row_2.length+1)/2; i++){
            if(row_2[i]==0){
                System.out.print("O");
            }else{
                System.out.print("X");
            }
        }
        System.out.print(" ");
        for(int i =9;i<row_2.length; i++){
            if(row_2[i]==0){
                System.out.print("O");
            }else{
                System.out.print("X");
            }
        }
        System.out.println();


        for(int i =1;i<(row_3.length+1)/2; i++){
            if(row_3[i]==0){
                System.out.print("O");
            }else{
                System.out.print("X");
            }
        }
        System.out.print(" ");
        for(int i =11;i<row_3.length; i++){
            if(row_3[i]==0){
                System.out.print("O");
            }else{
                System.out.print("X");
            }
        }
        System.out.println();
    }

    //case 3 method
    public  static void CancelTickets() {
        System.out.println("-----Cancel a ticket-----");
        System.out.println();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int row = input2.nextInt();
        if (row < 1 || row > 3) {
            System.out.println("Invalid row number");
            return;
        }
        int[] selected_Row = null;
        switch (row) {
            case 1:
                selected_Row = row_1;
                break;
            case 2:
                selected_Row = row_2;
                break;
            case 3:
                selected_Row = row_3;
                break;
        }
        System.out.print("Enter seat number (1-" + selected_Row.length + "):");
        int Seat = input2.nextInt();
        if (Seat < 1 || Seat > selected_Row.length) {
            System.out.println("Invalid seat number");
            return;
        }

        if (selected_Row[Seat] == 0) {
            System.out.println("Seat is already available.");
            return;
        }
        if (row == 1) {
            switch (Seat) {
                case 1:
                    if(Seat == 1){
                        selected_Row[1] = 0;
                    }
                    break;
                case 2:
                    if(Seat == 2){
                        selected_Row[2] = 0;
                    }
                    break;
                case 3:
                    if(Seat == 3){
                        selected_Row[3] = 0;
                    }
                    break;
                case 4:
                    if(Seat == 4){
                        selected_Row[4] = 0;
                    }
                    break;
                case 5:
                    if(Seat == 5){
                        selected_Row[5] = 0;
                    }
                    break;
                case 6:
                    if(Seat == 6){
                        selected_Row[6] = 0;
                    }
                    break;
                case 7:
                    if(Seat == 7){
                        selected_Row[7] = 0;
                    }
                    break;
                case 8:
                    if(Seat == 8){
                        selected_Row[8] = 0;
                    }
                    break;
                case 9:
                    if(Seat == 9){
                        selected_Row[9] = 0;
                    }
                    break;
                case 10:
                    if(Seat == 10){
                        selected_Row[10] = 0;
                    }
                    break;
                case 11:
                    if(Seat == 11){
                        selected_Row[11] = 0;
                    }
                    break;
                case 12:
                    if(Seat == 12){
                        selected_Row[12] = 0;
                    }
                    break;
            }
        } else if (row == 2) {
            switch (Seat) {
                case 1:
                    if(Seat == 1){
                        selected_Row[1] = 0;
                    }
                    break;
                case 2:
                    if(Seat == 2){
                        selected_Row[2] = 0;
                    }
                    break;
                case 3:
                    if(Seat == 3){
                        selected_Row[3] = 0;
                    }
                    break;
                case 4:
                    if(Seat == 4){
                        selected_Row[4] = 0;
                    }
                    break;
                case 5:
                    if(Seat == 5){
                        selected_Row[5] = 0;
                    }
                    break;
                case 6:
                    if(Seat == 6){
                        selected_Row[6] = 0;
                    }
                    break;
                case 7:
                    if(Seat == 7){
                        selected_Row[7] = 0;
                    }
                    break;
                case 8:
                    if(Seat == 8){
                        selected_Row[8] = 0;
                    }
                    break;
                case 9:
                    if(Seat == 9){
                        selected_Row[9] = 0;
                    }
                    break;
                case 10:
                    if(Seat == 10){
                        selected_Row[10] = 0;
                    }
                    break;
                case 11:
                    if(Seat == 11){
                        selected_Row[11] = 0;
                    }
                    break;
                case 12:
                    if(Seat == 12){
                        selected_Row[12] = 0;
                    }
                    break;
                case 13:
                    if(Seat == 13){
                        selected_Row[13] = 0;
                    }
                    break;
                case 14:
                    if(Seat == 14){
                        selected_Row[14] = 0;
                    }
                    break;
                case 15:
                    if(Seat == 15){
                        selected_Row[15] = 0;
                    }
                    break;
                case 16:
                    if(Seat == 16){
                        selected_Row[16] = 0;
                    }
                    break;


            }
        } else if (row == 3) {
            switch (Seat) {
                case 1:
                    if(Seat == 1){
                        selected_Row[1] = 0;
                    }
                    break;
                case 2:
                    if(Seat == 2){
                        selected_Row[2] = 0;
                    }
                    break;
                case 3:
                    if(Seat == 3){
                        selected_Row[3] = 0;
                    }
                    break;
                case 4:
                    if(Seat == 4){
                        selected_Row[4] = 0;
                    }
                    break;
                case 5:
                    if(Seat == 5){
                        selected_Row[5] = 0;
                    }
                    break;
                case 6:
                    if(Seat == 6){
                        selected_Row[6] = 0;
                    }
                    break;
                case 7:
                    if(Seat == 7){
                        selected_Row[7] = 0;
                    }
                    break;
                case 8:
                    if(Seat == 8){
                        selected_Row[8] = 0;
                    }
                    break;
                case 9:
                    if(Seat == 9){
                        selected_Row[9] = 0;
                    }
                    break;
                case 10:
                    if(Seat == 10){
                        selected_Row[10] = 0;
                    }
                    break;
                case 11:
                    if(Seat == 11){
                        selected_Row[11] = 0;
                    }
                    break;
                case 12:
                    if(Seat == 12){
                        selected_Row[12] = 0;
                    }
                    break;
                case 13:
                    if(Seat == 13){
                        selected_Row[13] = 0;
                    }
                    break;
                case 14:
                    if(Seat == 14){
                        selected_Row[14] = 0;
                    }
                    break;
                case 15:
                    if(Seat == 15){
                        selected_Row[15] = 0;
                    }
                    break;
                case 16:
                    if(Seat == 16){
                        selected_Row[16] = 0;
                    }
                    break;
                case 17:
                    if(Seat == 17){
                        selected_Row[17] = 0;
                    }
                    break;
                case 18:
                    if(Seat == 18){
                        selected_Row[18] = 0;
                    }
                    break;
                case 19:
                    if(Seat == 19){
                        selected_Row[19] = 0;
                    }
                    break;
                case 20:
                    if(Seat == 20){
                        selected_Row[20] = 0;
                    }
                    break;
            }
        }
        selected_Row[Seat] = 0;
        System.out.println("Ticket for row " + row + ", seat " + Seat + " has been cancelled.");

    }
    //case 4 method
    public static void ShowAvailable(){
        System.out.print("Seats available in row 1: ");
        for(int x=1; x<row_1.length; x++) {
            if(row_1[x] == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        System.out.print("Seats available in row 2: ");
        for(int x=1; x<row_2.length; x++) {
            if(row_2[x] == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        System.out.print("Seats available in row 3: ");
        for(int x=1; x<row_3.length; x++) {
            if(row_3[x] == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

    }

    public static void save(){
        try {
            FileWriter save = new FileWriter("rowsAvailable.txt");
            save.write("Seats available in row 1: ");
            for(int i = 1; i < row_1.length; i++) {
                if(row_1[i]==0) {
                    save.write(i + "  ");
                }
            }
            save.write("\n\n");
            save.write("Seats available in row 2: ");
            for(int i = 1; i < row_2.length; i++) {
                if(row_2[i]==0) {
                    save.write((i + "  "));
                }
            }
            save.write("\n\n");
            save.write("Seats available in row 3: ");
            for(int i = 1; i < row_3.length; i++) {
                if(row_3[i]==0) {
                    save.write(i + "  ");
                }
            }
            save.close();
            System.out.println("Saved Successfully.");

        }catch(IOException e){
            System.out.println("An Error Occurred.");
        }
    }

    public static void load(){
        try {
            File file = new File("rowsAvailable.txt");
            Scanner load = new Scanner(file);
            while (load.hasNext()) {
                String text = load.nextLine();
                System.out.println(text);
            }
            load.close();
        }catch (IOException e){
            System.out.println("Error while reading a file.");
  }
}

}
