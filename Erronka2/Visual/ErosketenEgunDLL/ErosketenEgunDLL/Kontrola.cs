using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ErosketenEgunDLL
{
    public partial class Kontrola : UserControl
    {
        public Kontrola()
        {
            InitializeComponent();
        }

        private void Kontrola_Load(object sender, EventArgs e)
        {

            this.salmentakTableAdapter.FillBy(this.txispakDataSet.Salmentak);

            chart1.DataSource = this.salmentakTableAdapter.GetDataBy().Select();

            chart1.Series[0].YValueMembers = "total_price";
            chart1.Series[0].XValueMember = "date";
            chart1.DataBind();
        }
    }
}
