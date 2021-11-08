
namespace BezeroakDLL
{
    partial class Kontrola
    {
        /// <summary> 
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de componentes

        /// <summary> 
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataVisualization.Charting.ChartArea chartArea1 = new System.Windows.Forms.DataVisualization.Charting.ChartArea();
            System.Windows.Forms.DataVisualization.Charting.Series series1 = new System.Windows.Forms.DataVisualization.Charting.Series();
            this.txispakDataSet = new BezeroakDLL.TxispakDataSet();
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.bezeroakTableAdapter = new BezeroakDLL.TxispakDataSetTableAdapters.BezeroakTableAdapter();
            this.produktuakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.produktuakTableAdapter = new BezeroakDLL.TxispakDataSetTableAdapters.ProduktuakTableAdapter();
            this.salmentakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.salmentakTableAdapter = new BezeroakDLL.TxispakDataSetTableAdapters.SalmentakTableAdapter();
            this.chart1 = new System.Windows.Forms.DataVisualization.Charting.Chart();
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).BeginInit();
            this.SuspendLayout();
            // 
            // txispakDataSet
            // 
            this.txispakDataSet.DataSetName = "TxispakDataSet";
            this.txispakDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bezeroakBindingSource
            // 
            this.bezeroakBindingSource.DataMember = "Bezeroak";
            this.bezeroakBindingSource.DataSource = this.txispakDataSet;
            // 
            // bezeroakTableAdapter
            // 
            this.bezeroakTableAdapter.ClearBeforeFill = true;
            // 
            // produktuakBindingSource
            // 
            this.produktuakBindingSource.DataMember = "Produktuak";
            this.produktuakBindingSource.DataSource = this.txispakDataSet;
            // 
            // produktuakTableAdapter
            // 
            this.produktuakTableAdapter.ClearBeforeFill = true;
            // 
            // salmentakBindingSource
            // 
            this.salmentakBindingSource.DataMember = "Salmentak";
            this.salmentakBindingSource.DataSource = this.txispakDataSet;
            // 
            // salmentakTableAdapter
            // 
            this.salmentakTableAdapter.ClearBeforeFill = true;
            // 
            // chart1
            // 
            this.chart1.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left)));
            this.chart1.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            chartArea1.AxisX.LabelStyle.ForeColor = System.Drawing.Color.WhiteSmoke;
            chartArea1.AxisX.MajorGrid.LineColor = System.Drawing.Color.Transparent;
            chartArea1.AxisX.MajorTickMark.LineColor = System.Drawing.Color.Silver;
            chartArea1.AxisY.LabelStyle.ForeColor = System.Drawing.Color.WhiteSmoke;
            chartArea1.AxisY.MajorGrid.LineColor = System.Drawing.Color.Transparent;
            chartArea1.AxisY.MajorTickMark.LineColor = System.Drawing.Color.Silver;
            chartArea1.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            chartArea1.Name = "ChartArea1";
            this.chart1.ChartAreas.Add(chartArea1);
            this.chart1.Location = new System.Drawing.Point(0, -2);
            this.chart1.Name = "chart1";
            series1.BorderColor = System.Drawing.SystemColors.ControlDarkDark;
            series1.ChartArea = "ChartArea1";
            series1.ChartType = System.Windows.Forms.DataVisualization.Charting.SeriesChartType.Bar;
            series1.IsValueShownAsLabel = true;
            series1.LabelBackColor = System.Drawing.SystemColors.ControlDarkDark;
            series1.LabelForeColor = System.Drawing.Color.White;
            series1.Name = "Series1";
            series1.Palette = System.Windows.Forms.DataVisualization.Charting.ChartColorPalette.BrightPastel;
            this.chart1.Series.Add(series1);
            this.chart1.Size = new System.Drawing.Size(400, 254);
            this.chart1.TabIndex = 0;
            this.chart1.Text = "chart1";
            // 
            // Kontrola
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.chart1);
            this.Name = "Kontrola";
            this.Size = new System.Drawing.Size(401, 252);
            this.Load += new System.EventHandler(this.Kontrola_Load);
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).EndInit();
            this.ResumeLayout(false);
            // 
            // Kontrola
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.chart1);
            this.Name = "Kontrola";
            this.Size = new System.Drawing.Size(401, 252);
            this.Load += new System.EventHandler(this.Kontrola_Load);
            ((System.ComponentModel.ISupportInitialize)(this.txispakDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.produktuakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.salmentakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private TxispakDataSet txispakDataSet;
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private TxispakDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.BindingSource produktuakBindingSource;
        private TxispakDataSetTableAdapters.ProduktuakTableAdapter produktuakTableAdapter;
        private System.Windows.Forms.BindingSource salmentakBindingSource;
        private TxispakDataSetTableAdapters.SalmentakTableAdapter salmentakTableAdapter;
        private System.Windows.Forms.DataVisualization.Charting.Chart chart1;
    }
}
