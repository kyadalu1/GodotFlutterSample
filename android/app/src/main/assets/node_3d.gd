extends Node3D

var current_gltf_node: Node3D = null

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	_load_gltf("apple.glb")
	


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	if current_gltf_node == null:
		return
		
	# Make the gltf model slowly rotate
	current_gltf_node.rotate_z(0.01)
	
func _load_gltf(gltf_path: String) -> void:
	if current_gltf_node != null:
		remove_child(current_gltf_node)
	
	current_gltf_node = load("res://"+gltf_path).instantiate()

	add_child(current_gltf_node)
	
