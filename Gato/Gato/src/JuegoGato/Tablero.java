/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoGato;

/**
 *
 * @author Alumno
 */
public class Tablero {
    private char M[][]=new char[3][3]; //renglon, columna
    private int Avance;
    private int fila;
    private int columna;

    public Tablero() {
        this.Avance=0;
        this.fila=0;
        this.columna=0;
    }
    
    
    public void mostrarTablero()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(M[i][j]+" | ");
            }
            System.out.println("\n");
        }
    }
    
    public int buscarGanador()
    {
        if(M[0][0]=='X' || M[0][0]=='O')
    {
        if(M[0][0]==M[0][1] && M[0][0]==M[0][2])
        {
            if(M[0][0]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }

        if(M[0][0]==M[1][0] && M[0][0]==M[2][0])
        {
           if(M[0][0]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }

    if(M[1][1]=='X' || M[1][1]=='O')
    {
        if(M[1][1]==M[0][0] && M[1][1]==M[2][2])
        {
            if(M[1][1]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }

        if(M[1][1]==M[1][0] && M[1][1]==M[1][2])
        {
           if(M[1][1]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }

        if(M[1][1]==M[2][0] && M[1][1]==M[0][2])
        {
           if(M[1][1]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }

        if(M[1][1]==M[0][1] && M[1][1]==M[2][1])
        {
           if(M[1][1]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
    }

    if(M[2][2]=='X' || M[2][2]=='O')
    {
        if(M[2][2]==M[2][0] && M[2][2]==M[2][1])
        {
            if(M[2][2]=='X')
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }

        if(M[2][2]==M[0][2] && M[2][2]==M[1][2])
        {
           if(M[2][2]=='X')
            {
                return 0; //Gana X
            }
            else
            {
                return 1; //Gana O
            }
        }
    }

    return 2; //Empate
    }

    
    public int movimientoPrimerJ(int fila, int columna, int pasos)
    {
        
        fila=fila-1;
        columna=columna-1;

    if(M[fila][columna]!=0)
    {
        System.out.println("Casilla marcada, elija otra\n");
        return pasos;
    }
    else
    {
        M[fila][columna]='X';
        return pasos=pasos+1;
    }

    
    }
    
    public int movimientoSegundoJ(int fila, int columna, int pasos)
    {
        fila=fila-1;
        columna=columna-1;

        if(M[fila][columna]!=0)
        {
        System.out.println("La casilla ya esta marcada, favor de elegir otra\n");
        return pasos;
        }
        else
        {
            M[fila][columna]='O';
            return pasos=pasos+1;
        }
    }
}
