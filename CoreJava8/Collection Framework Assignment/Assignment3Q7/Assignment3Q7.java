import java.util.*;
class ParkingSlot
{
	private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ParkingSlot(String name, String carModel, int carNo, int mobileNumber, String address) {
		super();
		this.name = name;
		this.carModel = carModel;
		this.carNo = carNo;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ParkingSlot [name=" + name + ", carModel=" + carModel + ", carNo=" + carNo + ", mobileNumber="
				+ mobileNumber + ", address=" + address + "]";
	}	
}
public class Assignment3Q7 
{
	public void add_new_car(ParkingSlot car) 
	{
        List<ParkingSlot> add_new_car = new ArrayList<>();
        System.out.println("Car added : "+add_new_car.add(car));
    }
	public void remove_car(List<ParkingSlot> l,String name) 
	{
        Iterator<ParkingSlot> itr = l.iterator();
        while(itr.hasNext())
		{
            ParkingSlot ps = itr.next();
                if (ps.getName().equals(name)) 
				{
                    itr.remove();
                }
        }
		for (ParkingSlot t: l) 
		{
            System.out.println(t);
        }
    }
	public ParkingSlot get_parked_car_name(List<ParkingSlot> l, String name) 
		{
			Iterator<ParkingSlot> itr = l.iterator();
			while (itr.hasNext()) 
			{
            ParkingSlot ps = itr.next();
            if (ps.getName().equals(name)) 
			{
                return ps;          
            }
			}
			return null;
		}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		Assignment3Q7 a=new Assignment3Q7();
		ParkingSlot slot1=new ParkingSlot("Raghav","model1",1,8805,"Pune");
		ParkingSlot slot2=new ParkingSlot("Ram","model2",2,9067,"Delhi");
		ParkingSlot slot3=new ParkingSlot("Sham","model3",3,8308,"Mumbai");
		ParkingSlot slot4=new ParkingSlot("Seen","model4",4,8805,"Indore");

		a.add_new_car(slot1);
		a.add_new_car(slot2);
		a.add_new_car(slot3);
		a.add_new_car(slot4);

		ArrayList<ParkingSlot> newList = new ArrayList<>();
        newList.add(slot1);
        newList.add(slot2);
      
		System.out.println("Enter owner name remove car : ");
        String rm = scanner.next();
        a.remove_car(newList,rm);

		System.out.println("Enter owner name to search : ");
        String car = scanner.next();
        System.out.println(a.get_parked_car_name(newList,car));
	}
}