
namespace AGINTEPRO
{
    partial class Form1
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

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.Windows.Forms.DataVisualization.Charting.ChartArea chartArea1 = new System.Windows.Forms.DataVisualization.Charting.ChartArea();
            System.Windows.Forms.DataVisualization.Charting.Series series1 = new System.Windows.Forms.DataVisualization.Charting.Series();
            System.Windows.Forms.DataVisualization.Charting.Title title1 = new System.Windows.Forms.DataVisualization.Charting.Title();
            this.chart1 = new System.Windows.Forms.DataVisualization.Charting.Chart();
            this.bezeroakBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.txpDataSet = new AGINTEPRO.txpDataSet();
            this.fillByToolStrip = new System.Windows.Forms.ToolStrip();
            this.fillByToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.bezeroakTableAdapter = new AGINTEPRO.txpDataSetTableAdapters.BezeroakTableAdapter();
            this.userControl11 = new PRODLL.UserControl1();
            this.bezeroakTableAdapter1 = new PRODLL.txpDataSetTableAdapters.BezeroakTableAdapter();
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.txpDataSet)).BeginInit();
            this.fillByToolStrip.SuspendLayout();
            this.SuspendLayout();
            // 
            // chart1
            // 
            this.chart1.BackColor = System.Drawing.Color.DimGray;
            chartArea1.AxisX.MajorGrid.LineColor = System.Drawing.Color.Transparent;
            chartArea1.AxisX.MajorTickMark.LineColor = System.Drawing.Color.Silver;
            chartArea1.AxisY.MajorGrid.LineColor = System.Drawing.Color.Transparent;
            chartArea1.AxisY.MajorTickMark.LineColor = System.Drawing.Color.Silver;
            chartArea1.BackColor = System.Drawing.Color.DimGray;
            chartArea1.Name = "ChartArea1";
            this.chart1.ChartAreas.Add(chartArea1);
            this.chart1.DataSource = this.bezeroakBindingSource;
            this.chart1.Location = new System.Drawing.Point(36, 288);
            this.chart1.Name = "chart1";
            this.chart1.Palette = System.Windows.Forms.DataVisualization.Charting.ChartColorPalette.Bright;
            series1.ChartArea = "ChartArea1";
            series1.ChartType = System.Windows.Forms.DataVisualization.Charting.SeriesChartType.Bar;
            series1.IsValueShownAsLabel = true;
            series1.Name = "Series1";
            series1.Palette = System.Windows.Forms.DataVisualization.Charting.ChartColorPalette.BrightPastel;
            this.chart1.Series.Add(series1);
            this.chart1.Size = new System.Drawing.Size(300, 300);
            this.chart1.TabIndex = 0;
            this.chart1.Text = "chart1";
            title1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            title1.Name = "Title1";
            title1.Text = "Bezerorik onena";
            this.chart1.Titles.Add(title1);
            // 
            // bezeroakBindingSource
            // 
            this.bezeroakBindingSource.DataMember = "Bezeroak";
            this.bezeroakBindingSource.DataSource = this.txpDataSet;
            // 
            // txpDataSet
            // 
            this.txpDataSet.DataSetName = "txpDataSet";
            this.txpDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // fillByToolStrip
            // 
            this.fillByToolStrip.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fillByToolStripButton});
            this.fillByToolStrip.Location = new System.Drawing.Point(0, 0);
            this.fillByToolStrip.Name = "fillByToolStrip";
            this.fillByToolStrip.Size = new System.Drawing.Size(800, 25);
            this.fillByToolStrip.TabIndex = 1;
            this.fillByToolStrip.Text = "fillByToolStrip";
            // 
            // fillByToolStripButton
            // 
            this.fillByToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Text;
            this.fillByToolStripButton.Name = "fillByToolStripButton";
            this.fillByToolStripButton.Size = new System.Drawing.Size(39, 22);
            this.fillByToolStripButton.Text = "FillBy";
            this.fillByToolStripButton.Click += new System.EventHandler(this.fillByToolStripButton_Click);
            // 
            // bezeroakTableAdapter
            // 
            this.bezeroakTableAdapter.ClearBeforeFill = true;
            // 
            // userControl11
            // 
            this.userControl11.Location = new System.Drawing.Point(36, 60);
            this.userControl11.Name = "userControl11";
            this.userControl11.Size = new System.Drawing.Size(298, 210);
            this.userControl11.TabIndex = 2;
            // 
            // bezeroakTableAdapter1
            // 
            this.bezeroakTableAdapter1.ClearBeforeFill = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(800, 634);
            this.Controls.Add(this.userControl11);
            this.Controls.Add(this.fillByToolStrip);
            this.Controls.Add(this.chart1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.chart1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.bezeroakBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.txpDataSet)).EndInit();
            this.fillByToolStrip.ResumeLayout(false);
            this.fillByToolStrip.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataVisualization.Charting.Chart chart1;
        private txpDataSet txpDataSet;
        private System.Windows.Forms.BindingSource bezeroakBindingSource;
        private txpDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter;
        private System.Windows.Forms.ToolStrip fillByToolStrip;
        private System.Windows.Forms.ToolStripButton fillByToolStripButton;
        private PRODLL.txpDataSetTableAdapters.BezeroakTableAdapter bezeroakTableAdapter1;
        private PRODLL.UserControl1 userControl11;
    }
}

