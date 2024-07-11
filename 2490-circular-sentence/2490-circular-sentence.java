    class Solution {
        public boolean isCircularSentence(String sentence) {
            String[] c = sentence.split(" ");

            for (int i = 0; i < c.length - 1; i++) {
                String cw = c[i];
                String nw = c[i + 1];

                if(cw.charAt(cw.length() - 1) != nw.charAt(0)){
                    return false;
                }
            }

            String fw = c[0];
            String lw = c[c.length - 1];

            return lw.charAt(lw.length() - 1) == fw.charAt(0);
        }
    }
