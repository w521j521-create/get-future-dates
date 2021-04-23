
    /**
     * riqi
     * @return
     * getNextDay(获取下一天日期)
     * new Date() 返回当前日期
     * thread.sleep 线程休眠时间
     * try catch 捕获异常
     * InterruptedException e  检测异常
     * e.printStachTrace   输出全部异常
     * return new Date()  返回日期
     * 加强版
     * public static Date getNextDays(int days)
     */
//    public static Date getNextDay(){
//        try {
//            Thread.sleep(24*60*60*1000);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        return new Date();
//
//
//    }

//    public static Date getNextDays(int dayes){
//        try{
//            Thread.sleep(days*24*24*1000)
//            }
//        catch (InterruptedException e){
//            e.printStackTrace();
//            }
//        return new Date();
//            }
    /**
     * 使用默认时区和区域设置获取日历。通过该方法生成Calendar对象。
     * 如下所示：Calendar cr=Calendar.getInstance()；
     * setTime()  方法以毫秒设置Date对象；
     * new Date() 创建对象
     *
     */

    public static Date getNextDays(int days)
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.Date, days);
        return c.getTime();



