package com.performance.module_2_148

class Feature148UseCase2(
    private val repository: Feature148Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
