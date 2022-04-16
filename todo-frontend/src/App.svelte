<script lang="ts">
	export let name: string;
	let item: string;
	let itemList = [];
	const addItem = () => {
		itemList = [...itemList, item];
	};
</script>

<main>
	<h2 style="text-align: center; margin-top: 2px; margin-bottom: 15px;">
		ToDo´s App
	</h2>
	<div class="row center">
		<div class="col-auto">
			<label for="inputPassword6" class="col-form-label">Name</label>
		</div>
		<div class="col-auto">
			<input class="form-control" bind:value={item} />
		</div>
		<div class="col-auto">
			<button class="btn btn-primary" on:click={addItem}>add</button>
		</div>
	</div>

	<i class="bi bi-trash" />
	<div>
		<div class="list-group">
			{#each itemList as itemElement}
				<label class="list-group-item">
					<input
						class="form-check-input me-1"
						type="checkbox"
						value=""
					/>
					{itemElement}

					<object
						class="right-botton"
						data="trash.svg"
						width="22px"
						height="22px"
					/>
				</label>
			{/each}
		</div>
	</div>
</main>

<style>
	.center {
		display: flex;
		justify-content: center;
	}
	.right-botton {
		align-items: center;
		position: relative;
		float: right;
		margin-top: 6px;
	}
</style>
