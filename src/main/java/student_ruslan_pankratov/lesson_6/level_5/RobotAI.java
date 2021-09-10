package student_ruslan_pankratov.lesson_6.level_5;

//Task_31
class RobotAI {

    public int[][] copy(int[][] arr) {
        updateArrayByRobotStep(arr);
        return arr;
    }

    private void updateArrayByRobotStep(int[][] arr) {
        checkOpponentsHorizontals(arr);
    }


    void checkOpponentsHorizontals(int[][] arr) {
        boolean wasMove = false;
        for (int i = 0; i < arr.length; i++) {
            int res = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    res++;
                    if (res == 2) {
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[i][k] == -1) {
                                arr[i][k] = 1;
                                wasMove = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!wasMove) {
            checkOpponentsVerticals(arr, wasMove);
        }
    }

    void checkOpponentsVerticals(int[][] arr, boolean wasMove) {

        for (int i = 0; i < arr.length; i++) {
            int res = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 0) {
                    res++;
                    if (res == 2) {
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[k][i] == -1) {
                                arr[k][i] = 1;
                                wasMove = true;
                                break;
                            }
                        }

                    }
                }

            }

        }
        if (!wasMove) {
            checkOpponentsDiagonals(arr, wasMove);
        }
    }


    void checkOpponentsDiagonals(int[][] arr, boolean wasMove) {
        int resultOne = 0;
        int resultTwo = 0;
        if (arr[0][0] == 0) {
            resultOne++;
        }
        if (arr[1][1] == 0) {
            resultOne++;
        }
        if (arr[2][2] == 0) {
            resultOne++;
        }

        if (resultOne == 2) {
            if (arr[0][0] == -1) {
                arr[0][0] = 1;
                wasMove = true;
            } else if (arr[1][1] == -1) {
                arr[1][1] = 1;
                wasMove = true;
            } else if (arr[2][2] == -1) {
                arr[2][2] = 1;
                wasMove = true;
            }
        } else {
            if (arr[0][2] == 0) {
                resultTwo++;
            }
            if (arr[1][1] == 0) {
                resultTwo++;
            }
            if (arr[2][0] == 0) {
                resultTwo++;
            }

            if (resultTwo == 2) {
                if (arr[0][2] == -1) {
                    arr[0][2] = 1;
                    wasMove = true;
                } else if (arr[1][1] == -1) {
                    arr[1][1] = 1;
                    wasMove = true;
                } else if (arr[2][0] == -1) {
                    arr[2][0] = 1;
                    wasMove = true;
                }
            }
        }
        if (!wasMove) {
            checkRobotsWinPositionHorizontally(arr, wasMove);
        }
    }


    void checkRobotsWinPositionHorizontally(int[][] arr, boolean wasMove) {
        int empty = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == -1 || arr[i][j] == 1) {
                    empty++;
                    if (empty == 3) {
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[i][k] != 0 && arr[i][k] != 1) {
                                arr[i][k] = 1;
                                wasMove = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!wasMove) {
            checkRobotsWinPositionVertically(arr, wasMove);
        }
    }

    void checkRobotsWinPositionVertically(int[][] arr, boolean wasMove) {
        int empty = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == -1 || arr[j][i] == 1) {
                    empty++;

                    if (empty == 3) {
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[k][i] != 0 && arr[k][i] != 1) {
                                arr[k][i] = 1;
                                wasMove = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!wasMove) {
            checkRobotsWinPositionDiagonally(arr);
        }
    }


    void checkRobotsWinPositionDiagonally(int[][] arr) {
        int resultOne = 0;
        int resultTwo = 0;
        if (arr[0][0] == -1 || arr[0][0] == 1) {
            resultOne++;
        }
        if (arr[1][1] == -1 || arr[1][1] == 1) {
            resultOne++;
        }
        if (arr[2][2] == -1 || arr[2][2] == 1) {
            resultOne++;
        }

        if (resultOne == 3) {
            if (arr[0][0] == -1) {
                arr[0][0] = 1;
            } else if (arr[1][1] == -1) {
                arr[1][1] = 1;
            } else if (arr[2][2] == -1) {
                arr[2][2] = 1;
            }
        } else {
            if (arr[0][2] == -1 || arr[0][2] == 1) {
                resultTwo++;
            }
            if (arr[1][1] == -1 || arr[1][1] == 1) {
                resultTwo++;
            }
            if (arr[2][0] == -1 || arr[2][0] == 1) {
                resultTwo++;
            }

            if (resultTwo == 3) {
                if (arr[0][2] == -1) {
                    arr[0][2] = 1;
                }
                if (arr[1][1] == -1) {
                    arr[1][1] = 1;
                }
                if (arr[2][0] == -1) {
                    arr[2][0] = 1;
                }
            }
        }
    }
}



