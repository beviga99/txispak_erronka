using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProduktuaDLL
{
    public partial class Kontrola : UserControl
    {
        public Kontrola()
        {
            InitializeComponent();
        }

        private void Kontrola_Load(object sender, EventArgs e)
        {

            this.salmentakTableAdapter.Fill(this.txispakDataSet.Salmentak);

            chart1.DataSource = this.salmentakTableAdapter.GetDataBy().Select().Take(5);

<<<<<<< HEAD
            chart1.Series[0].YValueMembers = "product_qty";
=======
            chart1.Series[0].YValueMembers = "product_qty2";
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
            chart1.Series[0].XValueMember = "Product_Name";
            chart1.DataBind();
        }
    }
}
