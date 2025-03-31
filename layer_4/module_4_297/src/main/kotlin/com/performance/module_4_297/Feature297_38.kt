package com.performance.module_4_297

class Feature297UseCase2(
    private val repository: Feature297Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
