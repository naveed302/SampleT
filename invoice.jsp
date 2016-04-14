<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<%@ include file="side.jsp"%>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />

<title>Editable Invoice</title>

<link rel='stylesheet' type='text/css' href='css/style.css' />
<link rel='stylesheet' type='text/css' href='css/print.css' media="print" />
<script type='text/javascript' src='js/jquery-1.3.2.min.js'></script>
<!-- <script>
var jq_1_3_2 = jQuery.noConflict();
</script> -->
<script type='text/javascript' src='js/invoice.js'></script>
<!-- <script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script> -->
<script type='text/javascript' src='js/jquery-1.12.0.min.js'></script>
<script>
var jq_1_12_0 = jQuery.noConflict();
</script>

<body>
	<div id="wrapper">

		<div id="page-wrapper">

			<div class="container-fluid">
				<!-- <button onclick="myFunction()">Click me</button> -->
				<textarea id="header">INVOICE</textarea>

				<div id="identity">

					<textarea id="address">My customer
Customer Address
city state india

Phone: (+91) 1234567890</textarea>

					<div id="logo">

						<div id="logoctr">
							<a href="javascript:;" id="change-logo" title="Change logo">Change
								Logo</a> <a href="javascript:;" id="save-logo" title="Save changes">Save</a>
							| <a href="javascript:;" id="delete-logo" title="Delete logo">Delete
								Logo</a> <a href="javascript:;" id="cancel-logo"
								title="Cancel changes">Cancel</a>
						</div>

						<div id="logohelp">
							<input id="imageloc" type="text" size="50" value="" /><br />
							(max width: 540px, max height: 100px)
						</div>
						<img id="image" src="images/logo.png" alt="logo" />
					</div>

				</div>

				<div style="clear: both"></div>

				<div id="customer">

					<!-- <textarea id="customer-title">Widget Corp.
c/o Steve Widget</textarea> -->

					<table id="meta">
						<tr>
							<td class="meta-head">Invoice #</td>
							<td><textarea>000123</textarea></td>
						</tr>
						<tr>

							<td class="meta-head">Date</td>
							<td><textarea id="date">December 15, 2009</textarea></td>
						</tr>
						<tr>
							<td class="meta-head">Amount Due</td>
							<td><div class="due">$875.00</div></td>
						</tr>

					</table>

				</div>

				<table id="items">

					<tr>
						<th>Item</th>
						<th>Description</th>
						<th>Unit Cost</th>
						<th>Quantity</th>
						<th>Price</th>
					</tr>

					<tr class="item-row">
						<td class="item-name"><div class="delete-wpr">
								<textarea onKeyPress="searchProduct(this.value)"></textarea >
								<!-- <select id="brand-select" name="brand"></select> -->
								<a class="delete" href="javascript:;" title="Remove row"
									style="display: none;">X</a>
							</div></td>
						<td class="description"><textarea>description will come here</textarea></td>
						<td><textarea class="cost">650.00</textarea></td>
						<td><textarea class="qty">1</textarea></td>
						<td><span class="price">650.00</span></td>
					</tr>

					<!-- <tr class="item-row">
						<td class="item-name"><div class="delete-wpr">
								<textarea>SSL Renewals</textarea>
								<a class="delete" href="javascript:;" title="Remove row">X</a>
							</div></td>

						<td class="description"><textarea>Yearly renewals of SSL certificates on main domain and several subdomains</textarea></td>
						<td><textarea class="cost">$75.00</textarea></td>
						<td><textarea class="qty">3</textarea></td>
						<td><span class="price">$225.00</span></td>
					</tr>
 -->
					<tr id="hiderow">
						<td colspan="5"><a id="addrow" href="javascript:;"
							title="Add a row">Add a row</a></td>
					</tr>

					<tr>
						<td colspan="2" class="blank"></td>
						<td colspan="2" class="total-line">Subtotal</td>
						<td class="total-value"><div id="subtotal">875.00</div></td>
					</tr>
					<tr>

						<td colspan="2" class="blank"></td>
						<td colspan="2" class="total-line">Total</td>
						<td class="total-value"><div id="total">875.00</div></td>
					</tr>
					<tr>
						<td colspan="2" class="blank"></td>
						<td colspan="2" class="total-line">Amount Paid</td>

						<td class="total-value"><textarea id="paid"> 0.00</textarea></td>
					</tr>
					<tr>
						<td colspan="2" class="blank"></td>
						<td colspan="2" class="total-line balance">Balance Due</td>
						<td class="total-value balance"><div class="due">
								875.00</div></td>
					</tr>

				</table>

				<div id="terms">
					<h5>Terms</h5>
					<textarea>NET 30 Days. Finance Charge of 1.5% will be made on unpaid balances after 30 days.</textarea>
				</div>

			</div>
		</div>
	</div>

</body>

</html>